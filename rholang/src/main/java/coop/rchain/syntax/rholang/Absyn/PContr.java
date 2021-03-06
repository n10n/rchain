package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class PContr extends Proc {
  public final String var_;
  public final ListCPattern listcpattern_;
  public final Proc proc_;
  public PContr(String p1, ListCPattern p2, Proc p3) { var_ = p1; listcpattern_ = p2; proc_ = p3; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.Proc.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.PContr) {
      coop.rchain.syntax.rholang.Absyn.PContr x = (coop.rchain.syntax.rholang.Absyn.PContr)o;
      return this.var_.equals(x.var_) && this.listcpattern_.equals(x.listcpattern_) && this.proc_.equals(x.proc_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.var_.hashCode())+this.listcpattern_.hashCode())+this.proc_.hashCode();
  }


}
