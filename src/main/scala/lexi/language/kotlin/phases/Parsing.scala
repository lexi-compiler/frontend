package lexi.language.kotlin.phases

import lexi.language.kotlin.languages.kotlin.ast.ASTNode
import maki.languages.kotlin.Parser
import maki.languages.kotlin.ast.ASTNode

object Parsing extends Phase {
  def apply(source: String): ASTNode =
    Parser(source)
}
