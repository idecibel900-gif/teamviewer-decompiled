package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class jz implements ObjectEncoder {
    public static final jz a = new jz();
    public static final FieldDescriptor b = FieldDescriptor.of("logRequest");

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(b, ((f00) ((j50) obj)).a);
    }
}
