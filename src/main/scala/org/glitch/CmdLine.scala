package org.glitch

import java.io.File

/**
 * Created by kyle on 5/25/15.
 */
class CmdLine {

  def main(args: Array[String]) {

    val parser = new scopt.OptionParser[CmdLineConfig]("scopt") {
      head("SimpleKlient", "1.0")
      opt[File]('i', "config") action { (x, c) =>
        c.copy(configFile = x)
      } text ("Input configuration file")
      opt[File]('o', "out") required() valueName ("<file>") action { (x, c) =>
        c.copy(outputFile = x)
      } text ("out is a required file property")
    }

    parser.parse(args, CmdLineConfig()) match {
      case Some(config) =>
        // read config file

        // if the config is valid, open output file


      case None =>
      // arguments are bad, error message will have been displayed
    }
  }

}


