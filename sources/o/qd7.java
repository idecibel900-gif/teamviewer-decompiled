package o;

/* JADX INFO: loaded from: classes2.dex */
public final class qd7 extends yx6 implements j97 {
    @Override // o.j97
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.t;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.u + ((long) ((int) ((p() + ((long) this.w)) - this.u)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.t;
            objArr.getClass();
            r(Integer.valueOf(((Number) objArr[((int) ((this.u + ((long) ((int) ((p() + ((long) this.w)) - this.u)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
