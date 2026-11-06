package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class vz implements ObjectEncoder {
    public static final vz a = new vz();
    public static final FieldDescriptor b = ua5.g(1, FieldDescriptor.builder("storageMetrics"));

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(b, ((fz2) obj).a);
    }
}
