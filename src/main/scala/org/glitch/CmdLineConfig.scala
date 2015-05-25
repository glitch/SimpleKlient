package org.glitch

import java.io.File
/**
 * Class to hold scopt Cmd line configuration
 */
case class CmdLineConfig ( configFile: File = new File("."), outputFile: File = new File(".") )