package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class lz implements ObjectEncoder {
    public static final lz a = new lz();
    public static final FieldDescriptor b = FieldDescriptor.of("eventTimeMs");
    public static final FieldDescriptor c = FieldDescriptor.of("eventCode");
    public static final FieldDescriptor d = FieldDescriptor.of("eventUptimeMs");
    public static final FieldDescriptor e = FieldDescriptor.of("sourceExtension");
    public static final FieldDescriptor f = FieldDescriptor.of("sourceExtensionJsonProto3");
    public static final FieldDescriptor g = FieldDescriptor.of("timezoneOffsetSeconds");
    public static final FieldDescriptor h = FieldDescriptor.of("networkConnectionInfo");

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        je4 je4Var = (je4) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(b, ((m00) je4Var).a);
        m00 m00Var = (m00) je4Var;
        objectEncoderContext.add(c, m00Var.b);
        objectEncoderContext.add(d, m00Var.c);
        objectEncoderContext.add(e, m00Var.d);
        objectEncoderContext.add(f, m00Var.e);
        objectEncoderContext.add(g, m00Var.f);
        objectEncoderContext.add(h, m00Var.g);
    }
}
