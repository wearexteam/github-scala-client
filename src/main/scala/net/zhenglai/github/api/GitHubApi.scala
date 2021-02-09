package net.zhenglai.github.api

import net.zhenglai.github.model.{Request, Response}

trait GitHubApi[A, B] extends (Request[A] => Response[B])
