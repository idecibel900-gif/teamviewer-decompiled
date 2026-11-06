package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zi extends cx2 implements Function1 {
    public final /* synthetic */ byte n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2705o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(t54 t54Var) {
        super(1, hm3.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f2705o = t54Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        f88 f88Var = f88.a;
        Object obj2 = this.f2705o;
        switch (b) {
            case 0:
                float[] fArr = ((wn4) obj).a;
                i04 i04Var = (i04) ((t54) obj2).D.getValue();
                if (i04Var != null) {
                    if (!i04Var.m()) {
                        i04Var = null;
                    }
                    if (i04Var != null) {
                        i04Var.h(fArr);
                    }
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((nl6) obj2).a.invoke(str);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(nl6 nl6Var) {
        super(1, hm3.class, "updateSearchValue", "SearchViewContent$updateSearchValue(Lcom/teamviewer/remotecontrolviewmodellib/search/data/SearchScreenActions;Ljava/lang/String;)V", 0);
        this.f2705o = nl6Var;
    }
}
