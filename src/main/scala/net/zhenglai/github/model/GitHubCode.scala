package net.zhenglai.github.model

trait GitHubCode
sealed trait RequestInvalid extends GitHubCode
final case object Ok extends GitHubCode
final case class NotFound(s: String) extends GitHubCode
