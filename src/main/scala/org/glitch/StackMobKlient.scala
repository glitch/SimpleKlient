package org.glitch

import com.stackmob.newman._
import com.stackmob.newman.dsl._
import scala.concurrent._
import scala.concurrent.duration._
import java.net.URL

/**
 * Hello world!
 *
 */
object StackMobKlient {
  implicit val httpClient = new ApacheHttpClient
  //execute a GET request
  val url = new URL("http://google.com")
  val response = Await.result(GET(url).apply, 1.second) //this will throw if the response doesn't return within 1 second
  println(s"Response returned from ${url.toString} with code ${response.code}, body ${response.bodyString}")
}
