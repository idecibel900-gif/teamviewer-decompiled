package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i52 {
    public ArrayList a;
    public float[] b;

    public i52(byte b) {
        switch (b) {
            case 1:
                this.b = new float[64];
                break;
            default:
                this.a = new ArrayList();
                float[] fArr = new float[5];
                for (int i = 0; i < 5; i++) {
                    fArr[i] = Float.NaN;
                }
                this.b = fArr;
                break;
        }
    }

    public void a(float f, Object obj) {
        ArrayList arrayList = this.a;
        arrayList.add(obj);
        if (this.b.length < arrayList.size()) {
            this.b = Arrays.copyOf(this.b, arrayList.size() + 2);
        }
        this.b[arrayList.size() - 1] = f;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void b(java.lang.String r23, java.util.ArrayList r24) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.i52.b(java.lang.String, java.util.ArrayList):void");
    }
}
