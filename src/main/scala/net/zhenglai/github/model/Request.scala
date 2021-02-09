package net.zhenglai.github

import cats.data.Ior

package object model {
  type GitHubErrorOr[A] = Either[GitHubError, A]
  type Request[Req] = GitHubErrorOr[Req]
  type Response[Resp] = GitHubErrorOr[Resp]
  type RoundTrip[Req, Resp] = Request[Req] Ior Response[Resp]
}
