package lexi.language.kotlin

import maki.languages.kotlin.Parser

import java.lang.Compiler

object CLI extends App {
  println(Parser.parseLisp(args(0)))
  println(Compiler.compile(args(0)))
}