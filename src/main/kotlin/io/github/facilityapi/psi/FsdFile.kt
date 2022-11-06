package io.github.facilityapi.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class FsdFile(
    viewProvider: FileViewProvider,
    language: Language,
) : PsiFileBase(viewProvider, language) {
    override fun getFileType(): FileType = viewProvider.fileType
    override fun toString(): String = "Facility Service Definition File"
}
