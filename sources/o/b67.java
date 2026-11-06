package o;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b67 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f403o;
    public final /* synthetic */ Object p;

    public /* synthetic */ b67(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f403o = obj2;
        this.p = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj = this.p;
        Object obj2 = this.f403o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                di1.s((au0) obj3).setPrimaryClip(ClipData.newRawUri(null, Uri.parse(((j67) ((i97) obj).getValue()).a)));
                ((Function0) obj2).a();
                return f88Var;
            case 1:
                Context context = (Context) obj3;
                final x57 x57Var = (x57) obj2;
                final f67 f67Var = (f67) obj;
                Intent intent = x57Var.e;
                final byte b2 = 0;
                Function0 function0 = new Function0() { // from class: o.g67
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b3 = b2;
                        f88 f88Var2 = f88.a;
                        x57 x57Var2 = x57Var;
                        f67 f67Var2 = f67Var;
                        switch (b3) {
                            case 0:
                                Function1 function1 = f67Var2.b;
                                String stringExtra = x57Var2.e.getStringExtra("eventaction");
                                stringExtra.getClass();
                                function1.invoke(stringExtra);
                                break;
                            default:
                                Function1 function2 = f67Var2.b;
                                String stringExtra2 = x57Var2.f.getStringExtra("eventaction");
                                stringExtra2.getClass();
                                function2.invoke(stringExtra2);
                                break;
                        }
                        return f88Var2;
                    }
                };
                try {
                    context.startActivity(intent);
                    function0.a();
                    break;
                } catch (ActivityNotFoundException unused) {
                    Intent intent2 = x57Var.f;
                    final byte b3 = 1;
                    Function0 function1 = new Function0() { // from class: o.g67
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b4 = b3;
                            f88 f88Var2 = f88.a;
                            x57 x57Var2 = x57Var;
                            f67 f67Var2 = f67Var;
                            switch (b4) {
                                case 0:
                                    Function1 function2 = f67Var2.b;
                                    String stringExtra = x57Var2.e.getStringExtra("eventaction");
                                    stringExtra.getClass();
                                    function2.invoke(stringExtra);
                                    break;
                                default:
                                    Function1 function3 = f67Var2.b;
                                    String stringExtra2 = x57Var2.f.getStringExtra("eventaction");
                                    stringExtra2.getClass();
                                    function3.invoke(stringExtra2);
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    try {
                        context.startActivity(intent2);
                        function1.a();
                    } catch (ActivityNotFoundException unused2) {
                        f67Var.a.a();
                    }
                    break;
                }
                return f88Var;
            case 2:
                return new ul1((List) obj3, (ye5) obj2, (pu7) obj);
            default:
                u0 u0Var = (u0) obj3;
                u0Var.removeOnAttachStateChangeListener((a0) obj2);
                vt1.y(u0Var).a.remove((ce8) obj);
                return f88Var;
        }
    }
}
