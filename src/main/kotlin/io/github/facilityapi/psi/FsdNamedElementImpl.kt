package io.github.facilityapi.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import io.github.facilityapi.psi.FsdNamedElement

abstract class FsdNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), FsdNamedElement
