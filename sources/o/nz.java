package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class nz implements ObjectEncoder {
    public static final nz a = new nz();
    public static final FieldDescriptor b = FieldDescriptor.of("networkType");
    public static final FieldDescriptor c = FieldDescriptor.of("mobileSubtype");

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        o25 o25Var = (o25) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(b, ((p00) o25Var).a);
        objectEncoderContext.add(c, ((p00) o25Var).b);
    }
}
