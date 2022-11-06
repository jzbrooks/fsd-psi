package io.github.facilityapi.psi

import com.intellij.lang.Language
import com.intellij.psi.tree.IElementType

class FsdElementType(name: String) : IElementType(name, language) {
    companion object {
        /** Required to be set at runtime so that elements are correctly assigned */
        var language: Language = Language.ANY
    }
}
