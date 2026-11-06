package o;

import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    public /* synthetic */ c5(px4 px4Var, byte b) {
        this.m = b;
        this.n = px4Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                ((Function0) px4Var.getValue()).a();
                break;
            case 1:
                ((Function0) px4Var.getValue()).a();
                break;
            case 2:
                ((Function0) px4Var.getValue()).a();
                break;
            case 3:
                ((Function1) px4Var.getValue()).invoke((d37) obj);
                break;
            case 4:
                ((Function1) px4Var.getValue()).invoke((ChatConversationID) obj);
                break;
            case 5:
                ((Function1) px4Var.getValue()).invoke((d37) obj);
                break;
            case 6:
                ((Function1) px4Var.getValue()).invoke((ChatConversationID) obj);
                break;
            case 7:
                ((Function1) px4Var.getValue()).invoke((ChatConversationID) obj);
                break;
            case 8:
                ((Function0) px4Var.getValue()).a();
                break;
            case ep1.b /* 9 */:
                ((Function1) px4Var.getValue()).invoke((d37) obj);
                break;
            case ep1.c /* 10 */:
                ((Function1) px4Var.getValue()).invoke((d37) obj);
                break;
            case 11:
                ((Function1) px4Var.getValue()).invoke((d37) obj);
                break;
            default:
                ((Function1) px4Var.getValue()).invoke((d37) obj);
                break;
        }
        return f88Var;
    }
}
