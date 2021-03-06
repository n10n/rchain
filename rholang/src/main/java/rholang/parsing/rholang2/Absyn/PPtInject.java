package rholang.parsing.rholang2.Absyn; // Java Package generated by the BNF Converter.

public class PPtInject extends PPattern {
  public final CPattern cpattern_;
  public PPtInject(CPattern p1) { cpattern_ = p1; }

  public <R,A> R accept(rholang.parsing.rholang2.Absyn.PPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang2.Absyn.PPtInject) {
      rholang.parsing.rholang2.Absyn.PPtInject x = (rholang.parsing.rholang2.Absyn.PPtInject)o;
      return this.cpattern_.equals(x.cpattern_);
    }
    return false;
  }

  public int hashCode() {
    return this.cpattern_.hashCode();
  }


}
