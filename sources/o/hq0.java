package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hq0 implements Function1 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f996o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ hq0(List list, r74 r74Var, Function1 function1, Function1 function2, Function1 function3, Function1 function4, String str, yy0 yy0Var) {
        this.n = list;
        this.f996o = r74Var;
        this.p = function1;
        this.q = function2;
        this.r = function3;
        this.s = function4;
        this.t = str;
        this.u = yy0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.u;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.r;
        Object obj6 = this.q;
        Object obj7 = this.p;
        Object obj8 = this.f996o;
        Object obj9 = this.n;
        switch (b) {
            case 0:
                cc7 cc7Var = (cc7) obj4;
                i97 i97Var = (i97) obj7;
                i97 i97Var2 = (i97) obj6;
                i97 i97Var3 = (i97) obj5;
                cc7 cc7Var2 = (cc7) obj3;
                bq0 bq0Var = (bq0) obj2;
                u52 u52Var = (u52) obj;
                long j = ((rv0) ((i97) obj9).getValue()).a;
                long j2 = ((rv0) ((i97) obj8).getValue()).a;
                float fD0 = u52Var.d0(2.0f);
                float f = cc7Var.a;
                float f2 = f / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (u52Var.d() >> 32));
                int i = rv0.i;
                boolean zA = z68.a(j, j2);
                zk2 zk2Var = zk2.a;
                if (zA) {
                    u52.p(u52Var, j, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fD0)) << 32) | (((long) Float.floatToRawIntBits(fD0)) & 4294967295L), zk2Var, 226);
                } else {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                    float f3 = fIntBitsToFloat - (f * 2.0f);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                    float fMax = Math.max(0.0f, fD0 - f);
                    u52Var = u52Var;
                    u52.p(u52Var, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), zk2Var, 224);
                    float f4 = fIntBitsToFloat - f;
                    float f5 = fD0 - f2;
                    u52.p(u52Var, j2, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), cc7Var, 224);
                }
                long j3 = ((rv0) i97Var.getValue()).a;
                float fFloatValue = ((Number) i97Var2.getValue()).floatValue();
                float fFloatValue2 = ((Number) i97Var3.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (u52Var.d() >> 32));
                float fG = vs1.G(0.4f, 0.5f, fFloatValue2);
                float fG2 = vs1.G(0.7f, 0.5f, fFloatValue2);
                float fG3 = vs1.G(0.5f, 0.5f, fFloatValue2);
                float fG4 = vs1.G(0.3f, 0.5f, fFloatValue2);
                rj rjVar = bq0Var.a;
                rj rjVar2 = bq0Var.c;
                rjVar.a.rewind();
                rj rjVar3 = bq0Var.a;
                Path path = rjVar3.a;
                path.moveTo(0.2f * fIntBitsToFloat2, fG3 * fIntBitsToFloat2);
                rjVar3.e(fG * fIntBitsToFloat2, fG2 * fIntBitsToFloat2);
                rjVar3.e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fG4);
                sj sjVar = bq0Var.b;
                PathMeasure pathMeasure = sjVar.a;
                pathMeasure.setPath(path, false);
                rjVar2.a.rewind();
                sjVar.a(0.0f, pathMeasure.getLength() * fFloatValue, rjVar2);
                u52Var.i0(rjVar2, j3, cc7Var2);
                break;
            default:
                List list = (List) obj9;
                h44 h44Var = (h44) obj;
                h44Var.getClass();
                h44Var.b(list.size(), new y2(new qo2((byte) 8), list, (byte) 15), new ha1(list, (byte) 3), new yy0(2039820996, true, new x74(list, (r74) obj8, (Function1) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (String) obj3, (yy0) obj2, list)));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ hq0(i97 i97Var, i97 i97Var2, cc7 cc7Var, i97 i97Var3, q18 q18Var, q18 q18Var2, cc7 cc7Var2, bq0 bq0Var) {
        this.n = i97Var;
        this.f996o = i97Var2;
        this.s = cc7Var;
        this.p = i97Var3;
        this.q = q18Var;
        this.r = q18Var2;
        this.t = cc7Var2;
        this.u = bq0Var;
    }
}
