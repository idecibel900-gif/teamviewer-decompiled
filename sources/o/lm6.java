package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lm6 extends cx2 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nl6 f1382o;
    public final /* synthetic */ me1 p;
    public final /* synthetic */ w44 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm6(nl6 nl6Var, me1 me1Var, w44 w44Var, byte b) {
        super(1, hm3.class, "selectTabAndScrollToTop", "SearchViewContent$selectTabAndScrollToTop(Lcom/teamviewer/remotecontrolviewmodellib/search/data/SearchScreenActions;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/LazyListState;Lcom/teamviewer/remotecontrolviewlib/ui/searchscreen/data/SearchTab;)V", 0);
        this.n = b;
        switch (b) {
            case 1:
                this.f1382o = nl6Var;
                this.p = me1Var;
                this.q = w44Var;
                super(1, hm3.class, "selectTabAndScrollToTop", "SearchViewContent$selectTabAndScrollToTop(Lcom/teamviewer/remotecontrolviewmodellib/search/data/SearchScreenActions;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/LazyListState;Lcom/teamviewer/remotecontrolviewlib/ui/searchscreen/data/SearchTab;)V", 0);
                break;
            default:
                this.f1382o = nl6Var;
                this.p = me1Var;
                this.q = w44Var;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        f88 f88Var = f88.a;
        byte b2 = 1;
        hc1 hc1Var = null;
        w44 w44Var = this.q;
        me1 me1Var = this.p;
        nl6 nl6Var = this.f1382o;
        switch (b) {
            case 0:
                zl6 zl6Var = (zl6) obj;
                zl6Var.getClass();
                nl6Var.b.invoke(zl6Var.f2714o);
                im3.R(me1Var, null, null, new t44(w44Var, hc1Var, b2), 3);
                break;
            default:
                zl6 zl6Var2 = (zl6) obj;
                zl6Var2.getClass();
                nl6Var.b.invoke(zl6Var2.f2714o);
                im3.R(me1Var, null, null, new t44(w44Var, hc1Var, b2), 3);
                break;
        }
        return f88Var;
    }
}
