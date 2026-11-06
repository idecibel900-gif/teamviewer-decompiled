package com.teamviewer.teamviewerlib.bcommands;

import android.util.SparseArray;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import o.ai7;
import o.an4;
import o.bi7;
import o.ci7;
import o.e41;
import o.ej7;
import o.g10;
import o.i10;
import o.ig5;
import o.j10;
import o.k10;
import o.l10;
import o.si7;
import o.ub7;
import o.vv;
import o.ye4;
import o.yq4;
import o.zh7;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0010\u0018\u0000J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0082 ¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\b\u0010\tJ(\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0018H\u0082 ¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001eH\u0082 ¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b!\u0010\"J(\u0010$\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020#H\u0082 ¢\u0006\u0004\b$\u0010%J(\u0010&\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b&\u0010'J \u0010(\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0082 ¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/teamviewer/teamviewerlib/bcommands/BCommandNativeImpl;", "", "commandType", "", "jniNewBCommand", "(B)J", "addr", "Lo/f88;", "jniDeleteBCommand", "(J)V", "param", "", "data", "jniAddParam", "(JB[B)V", "jniGetParam", "(JB)[B", "jniGetCommandType", "(J)B", "value", "jniSetTargetParticipantId", "(JJ)V", "jniGetSenderParticipantId", "(J)J", "", "jniGetStreamId", "(J)I", "i", "jniSetKnownStream", "(JI)V", "", "jniSetStreamFlags", "(JC)V", "jniSerializeBCommand", "(J)[B", "", "jniAddParamUuid", "(JBLjava/lang/String;)V", "jniAddParamDyngateID", "(JBJ)V", "jniGetParamDyngateID", "(JB)J", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class BCommandNativeImpl {
    public final long a;
    public boolean b;

    public BCommandNativeImpl(long j) {
        if (j != 0) {
            this.a = j;
        } else {
            yq4.l("cptr must not be 0!");
            throw null;
        }
    }

    private final native void jniAddParam(long addr, byte param, byte[] data);

    private final native void jniAddParamDyngateID(long addr, byte param, long data);

    private final native void jniAddParamUuid(long addr, byte param, String data);

    private final native void jniDeleteBCommand(long addr);

    private final native byte jniGetCommandType(long addr);

    private final native byte[] jniGetParam(long addr, byte param);

    private final native long jniGetParamDyngateID(long addr, byte param);

    private final native long jniGetSenderParticipantId(long addr);

    private final native int jniGetStreamId(long addr);

    private final native long jniNewBCommand(byte commandType);

    private final native byte[] jniSerializeBCommand(long addr);

    private final native void jniSetKnownStream(long addr, int i);

    private final native void jniSetStreamFlags(long addr, char i);

    private final native void jniSetTargetParticipantId(long addr, long value);

    public final void A() {
        jniSetStreamFlags(this.a, (char) 1);
    }

    public final void B(ParticipantIdentifier participantIdentifier) {
        participantIdentifier.getClass();
        jniSetTargetParticipantId(this.a, participantIdentifier.toInt64());
    }

    public final void a(i10 i10Var, byte[] bArr) {
        i10Var.getClass();
        jniAddParam(this.a, i10Var.a(), bArr);
    }

    public final void b(i10 i10Var, byte b) {
        i10Var.getClass();
        a(i10Var, new byte[]{b});
    }

    public final void c(DyngateID dyngateID) {
        jniAddParamDyngateID(this.a, (byte) 0, dyngateID.ToLong());
    }

    public final void d(i10 i10Var, int i) {
        i10Var.getClass();
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i & 255);
            i >>= 8;
        }
        a(i10Var, bArr);
    }

    public final void e(i10 i10Var, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putLong(j);
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        a(i10Var, bArrArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BCommandNativeImpl) {
            return this.a == ((BCommandNativeImpl) obj).a || this == obj;
        }
        return false;
    }

    public final void f(i10 i10Var, String str) {
        byte[] bytes;
        i10Var.getClass();
        str.getClass();
        String strConcat = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        try {
            Charset charsetForName = Charset.forName("UTF-16LE");
            charsetForName.getClass();
            bytes = strConcat.getBytes(charsetForName);
            bytes.getClass();
        } catch (UnsupportedEncodingException e) {
            e41.s("toEncodedBytes UnsupportedEncodingException ", e.getMessage(), "EncodingHelperFuncs");
            bytes = new byte[0];
        }
        a(i10Var, bytes);
    }

    public final void g(i10 i10Var, String str) {
        byte[] bytes;
        try {
            Charset charsetForName = Charset.forName("UTF-8");
            charsetForName.getClass();
            bytes = str.getBytes(charsetForName);
            bytes.getClass();
        } catch (UnsupportedEncodingException e) {
            e41.s("toEncodedBytes UnsupportedEncodingException ", e.getMessage(), "EncodingHelperFuncs");
            bytes = new byte[0];
        }
        a(i10Var, bytes);
    }

    public final void h(String str) {
        jniAddParamUuid(this.a, (byte) 1, str);
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final void i(i10 i10Var, List list, k10 k10Var) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList<byte[]> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            byte[] bArrA = k10Var.a(it.next());
            if (bArrA != null) {
                arrayList.add(bArrA);
                length += bArrA.length + 4;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        a(i10Var, bArrArray);
    }

    public final void j(List list) {
        if (list.isEmpty()) {
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(list.size() * 4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            byte[] bArr = new byte[4];
            for (int i = 0; i < 4; i++) {
                bArr[i] = (byte) (iIntValue & 255);
                iIntValue >>= 8;
            }
            byteBufferAllocate.put(bArr);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        a(ej7.RequestedRSModules, bArrArray);
    }

    public final void k() {
        jniDeleteBCommand(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public final g10 l() {
        ai7 ai7VarO = o(l10.CommandClass);
        if (ai7VarO.a <= 0) {
            return g10.CCUndefined;
        }
        vv vvVar = g10.n;
        byte b = ai7VarO.b;
        vvVar.getClass();
        return (g10) g10.f844o.C(b);
    }

    public final zh7 m(i10 i10Var) {
        i10Var.getClass();
        byte[] bArrJniGetParam = jniGetParam(this.a, i10Var.a());
        return bArrJniGetParam.length == 0 ? zh7.f2703o : new zh7(bArrJniGetParam);
    }

    public final ig5 n(i10 i10Var) {
        i10Var.getClass();
        byte[] bArrJniGetParam = jniGetParam(this.a, i10Var.a());
        if (bArrJniGetParam.length != 1) {
            return ig5.e;
        }
        if (bArrJniGetParam.length != 0) {
            return bArrJniGetParam[0] == 0 ? ig5.f : ig5.g;
        }
        an4.j("Array is empty.");
        return null;
    }

    public final ai7 o(i10 i10Var) {
        i10Var.getClass();
        byte[] bArrJniGetParam = jniGetParam(this.a, i10Var.a());
        if (bArrJniGetParam.length != 1) {
            return ai7.d;
        }
        SparseArray sparseArray = ai7.c;
        if (bArrJniGetParam.length == 0) {
            an4.j("Array is empty.");
            return null;
        }
        byte b = bArrJniGetParam[0];
        SparseArray sparseArray2 = ai7.c;
        ai7 ai7Var = (ai7) sparseArray2.get(b);
        if (ai7Var != null) {
            return ai7Var;
        }
        ai7 ai7Var2 = new ai7(1, b);
        sparseArray2.put(b, ai7Var2);
        return ai7Var2;
    }

    public final DyngateID p() {
        DyngateID dyngateIDFromLong = DyngateID.FromLong(jniGetParamDyngateID(this.a, (byte) 0));
        dyngateIDFromLong.getClass();
        return dyngateIDFromLong;
    }

    public final ci7 q(i10 i10Var) {
        i10Var.getClass();
        byte[] bArrJniGetParam = jniGetParam(this.a, i10Var.a());
        if (bArrJniGetParam.length != 4) {
            return ci7.d;
        }
        int i = (bArrJniGetParam[0] & 255) | ((bArrJniGetParam[3] << 24) & (-16777216)) | ((bArrJniGetParam[2] << 16) & 16711680) | ((bArrJniGetParam[1] << 8) & 65280);
        SparseArray sparseArray = ci7.c;
        ci7 ci7Var = (ci7) sparseArray.get(i);
        if (ci7Var != null) {
            return ci7Var;
        }
        ci7 ci7Var2 = new ci7(4, i);
        sparseArray.put(i, ci7Var2);
        return ci7Var2;
    }

    public final bi7 r(i10 i10Var) {
        byte[] bArrJniGetParam = jniGetParam(this.a, i10Var.a());
        if (bArrJniGetParam.length != 8) {
            return bi7.b;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrJniGetParam);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return new bi7(byteBufferWrap.getLong());
    }

    public final zh7 s(i10 i10Var) {
        String strS;
        i10Var.getClass();
        byte[] bArrJniGetParam = jniGetParam(this.a, i10Var.a());
        bArrJniGetParam.getClass();
        try {
            Charset charsetForName = Charset.forName("UTF-16LE");
            charsetForName.getClass();
            strS = ub7.x0(new String(bArrJniGetParam, charsetForName)).toString();
        } catch (UnsupportedEncodingException e) {
            e41.s("toEncoding UnsupportedEncodingException ", e.getMessage(), "EncodingHelperFuncs");
            strS = "";
        }
        if (strS.length() > 0 && ub7.c0(strS) == 0) {
            strS = ub7.S(strS);
        }
        return new zh7(strS.length(), strS);
    }

    public final ArrayList t(i10 i10Var, j10 j10Var) {
        byte[] bArrJniGetParam = jniGetParam(this.a, i10Var.a());
        ArrayList arrayList = new ArrayList();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrJniGetParam);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferWrap.hasRemaining()) {
            try {
                Object objA = j10Var.a(byteBufferWrap, byteBufferWrap.getInt());
                if (objA != null) {
                    arrayList.add(objA);
                }
            } catch (BufferUnderflowException e) {
                ye4.c("NativeBCommand", "getParamVector() param=" + i10Var + " " + e.getMessage());
                return null;
            }
        }
        return arrayList;
    }

    public String toString() {
        return l() + " rct=" + ((int) jniGetCommandType(this.a));
    }

    public final ArrayList u() {
        byte[] bArrJniGetParam = jniGetParam(this.a, (byte) 25);
        if (bArrJniGetParam.length % 4 != 0) {
            ye4.c("NativeBCommand", "getParamVectorPOD(): invalid length.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrJniGetParam);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferWrap.hasRemaining()) {
            try {
                arrayList.add(Integer.valueOf(byteBufferWrap.getInt()));
            } catch (BufferUnderflowException e) {
                ye4.c("NativeBCommand", "getParamVectorPOD() param=" + si7.SupportedAuthenticationMethods + " " + e.getMessage());
                return null;
            }
        }
        return arrayList;
    }

    public final byte v() {
        return jniGetCommandType(this.a);
    }

    public final long w() {
        return jniGetSenderParticipantId(this.a);
    }

    public final int x() {
        return jniGetStreamId(this.a);
    }

    public final zh7 y() {
        byte[] bArrJniSerializeBCommand = jniSerializeBCommand(this.a);
        return !(bArrJniSerializeBCommand.length == 0) ? new zh7(bArrJniSerializeBCommand) : zh7.f2703o;
    }

    public final void z(KnownStreams knownStreams) {
        knownStreams.getClass();
        jniSetKnownStream(this.a, knownStreams.swigValue());
    }

    public BCommandNativeImpl(g10 g10Var, byte b) {
        this.a = jniNewBCommand(b);
        b(l10.CommandClass, g10Var.m);
    }
}
