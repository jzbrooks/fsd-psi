// This is a generated file. Not intended for manual editing.
package io.github.facilityapi.intellij.psi;

import io.github.facilityapi.psi.FsdNamedElement;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface FsdIdentifierDeclaration extends FsdNamedElement {

  @NotNull
  PsiElement getIdentifier();

  @NotNull
  String getName();

  @NotNull
  PsiElement setName(@NotNull String name);

  @NotNull
  PsiElement getNameIdentifier();

  @NotNull
  ItemPresentation getPresentation();

}
