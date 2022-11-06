package io.github.facilityapi.psi

import com.intellij.psi.PsiElement
import io.github.facilityapi.intellij.psi.FsdAttributeList

interface FsdDecoratedElement : PsiElement {
    val attributeListList: List<FsdAttributeList>
}
