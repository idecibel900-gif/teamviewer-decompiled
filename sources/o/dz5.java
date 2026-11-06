package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dz5 extends lq1 {
    public final /* synthetic */ byte d;
    public final Appendable e;

    public /* synthetic */ dz5(Appendable appendable, byte b) {
        this.d = b;
        this.e = appendable;
    }

    @Override // o.lq1
    public final lq1 j(char c) {
        byte b = this.d;
        Appendable appendable = this.e;
        switch (b) {
            case 0:
                try {
                    appendable.append(c);
                    return this;
                } catch (IOException e) {
                    throw new mq6(e);
                }
            default:
                ((StringBuilder) appendable).append(c);
                return this;
        }
    }

    @Override // o.lq1
    public final lq1 k(CharSequence charSequence) {
        byte b = this.d;
        Appendable appendable = this.e;
        switch (b) {
            case 0:
                try {
                    appendable.append(charSequence);
                    return this;
                } catch (IOException e) {
                    throw new mq6(e);
                }
            default:
                ((StringBuilder) appendable).append(charSequence);
                return this;
        }
    }

    @Override // o.lq1
    public final lq1 l(char[] cArr, int i) {
        byte b = this.d;
        Appendable appendable = this.e;
        switch (b) {
            case 0:
                try {
                    appendable.append(new String(cArr, 0, i));
                    return this;
                } catch (IOException e) {
                    throw new mq6(e);
                }
            default:
                ((StringBuilder) appendable).append(cArr, 0, i);
                return this;
        }
    }

    public String toString() {
        switch (this.d) {
            case 1:
                return ((StringBuilder) this.e).toString();
            default:
                return super.toString();
        }
    }
}
