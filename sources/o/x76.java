package o;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x76 extends bx2 implements Function1 {
    public static final x76 n = new x76(1);

    @Override // o.bj0, o.rt3
    public final String getName() {
        return "isSynthetic";
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        return w86.a.b(Member.class);
    }

    @Override // o.bj0
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        member.getClass();
        return Boolean.valueOf(member.isSynthetic());
    }
}
