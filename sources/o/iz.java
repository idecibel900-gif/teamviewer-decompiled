package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class iz implements ObjectEncoder {
    public static final iz a = new iz();
    public static final FieldDescriptor b = FieldDescriptor.of("sdkVersion");
    public static final FieldDescriptor c = FieldDescriptor.of("model");
    public static final FieldDescriptor d = FieldDescriptor.of("hardware");
    public static final FieldDescriptor e = FieldDescriptor.of("device");
    public static final FieldDescriptor f = FieldDescriptor.of("product");
    public static final FieldDescriptor g = FieldDescriptor.of("osBuild");
    public static final FieldDescriptor h = FieldDescriptor.of("manufacturer");
    public static final FieldDescriptor i = FieldDescriptor.of("fingerprint");
    public static final FieldDescriptor j = FieldDescriptor.of("locale");
    public static final FieldDescriptor k = FieldDescriptor.of("country");
    public static final FieldDescriptor l = FieldDescriptor.of("mccMnc");
    public static final FieldDescriptor m = FieldDescriptor.of("applicationBuild");

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        fg fgVar = (fg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(b, ((d00) fgVar).a);
        d00 d00Var = (d00) fgVar;
        objectEncoderContext.add(c, d00Var.b);
        objectEncoderContext.add(d, d00Var.c);
        objectEncoderContext.add(e, d00Var.d);
        objectEncoderContext.add(f, d00Var.e);
        objectEncoderContext.add(g, d00Var.f);
        objectEncoderContext.add(h, d00Var.g);
        objectEncoderContext.add(i, d00Var.h);
        objectEncoderContext.add(j, d00Var.i);
        objectEncoderContext.add(k, d00Var.j);
        objectEncoderContext.add(l, d00Var.k);
        objectEncoderContext.add(m, d00Var.l);
    }
}
