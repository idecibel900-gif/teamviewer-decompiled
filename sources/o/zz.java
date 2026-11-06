package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class zz implements ObjectEncoder {
    public static final zz a = new zz();
    public static final FieldDescriptor b = ua5.g(1, FieldDescriptor.builder("currentCacheSizeBytes"));
    public static final FieldDescriptor c = ua5.g(2, FieldDescriptor.builder("maxCacheSizeBytes"));

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        oa7 oa7Var = (oa7) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(b, oa7Var.a);
        objectEncoderContext.add(c, oa7Var.b);
    }
}
