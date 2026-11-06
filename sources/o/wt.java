package o;

/* JADX INFO: loaded from: classes.dex */
public class wt extends df6 {
    public final /* synthetic */ yt t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(yt ytVar) {
        super((Object) ytVar, (byte) 17);
        this.t = ytVar;
    }

    @Override // o.df6, o.vt
    public final void d(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // o.df6, o.vt
    public final void e(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }
}
