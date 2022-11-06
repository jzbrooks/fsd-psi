// This is a generated file. Not intended for manual editing.
package io.github.facilityapi.intellij.psi;

import java.util.List;

import io.github.facilityapi.psi.FsdDecoratedElement;
import org.jetbrains.annotations.*;

public interface FsdDecoratedServiceItem extends FsdDecoratedElement {

  @NotNull
  List<FsdAttributeList> getAttributeListList();

  @Nullable
  FsdDataSpec getDataSpec();

  @Nullable
  FsdEnumSpec getEnumSpec();

  @Nullable
  FsdErrorSetSpec getErrorSetSpec();

  @Nullable
  FsdMethodSpec getMethodSpec();

}
