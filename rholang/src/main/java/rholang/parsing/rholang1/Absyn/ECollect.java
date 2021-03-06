package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class ECollect extends Entity {
  public final Collect collect_;
  public ECollect(Collect p1) { collect_ = p1; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Entity.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.ECollect) {
      rholang.parsing.rholang1.Absyn.ECollect x = (rholang.parsing.rholang1.Absyn.ECollect)o;
      return this.collect_.equals(x.collect_);
    }
    return false;
  }

  public int hashCode() {
    return this.collect_.hashCode();
  }


}
