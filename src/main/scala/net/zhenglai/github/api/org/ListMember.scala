package net.zhenglai.github.api.org

import net.zhenglai.github.api.GitHubApi
import net.zhenglai.github.model.Request

case class ListMemberReq(organizationName: String)
case class ListMemberResp(organizationName: String, url: String)

object ListMember extends GitHubApi[ListMemberReq, ListMemberResp] {
  override def apply(v1: Request[ListMemberReq]): Request[ListMemberResp] = ???
}
