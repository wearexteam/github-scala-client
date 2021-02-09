package net.zhenglai.github

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.http.scaladsl.model.{HttpMethods, HttpRequest, HttpResponse}
import spray.json.DefaultJsonProtocol._
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._

import scala.concurrent.Future
import scala.util.{Failure, Success}

final case class User(login: String, id: Long, url: String, `type`: String)
final case class Resp[T](data: T)

object GitHubApp extends App {
  implicit val system = ActorSystem(Behaviors.empty, "SingleRequest")
  implicit val executionContext = system.executionContext
  implicit val userFormat = jsonFormat4(User)
  val responseFuture: Future[HttpResponse] =
    Http().singleRequest(
      HttpRequest(
        method = HttpMethods.GET,
        uri = "https://api.github.com/users/zhenglaizhang"
      )
    )
  responseFuture.onComplete {
    case Success(res)       => Unmarshal(res).to[User].foreach(println)
    case Failure(exception) => println(exception)
  }
}
