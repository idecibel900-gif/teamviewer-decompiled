package o;

import android.content.ComponentName;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qz implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x028e  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:142:0x02c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:150:0x0314  */
    /* JADX WARN: Code duplicated, block: B:177:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:139:0x028e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        uc6 uc6Var;
        uc6 uc6VarB;
        ArrayList arrayList;
        float f;
        nl5 nl5Var = null;
        ComponentName componentName = null;
        boolean z = true;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                int i = message.what;
                sz szVar = (sz) this.b;
                if (i != 1) {
                    return false;
                }
                szVar.b();
                return true;
            case 1:
                o10 o10Var = (o10) this.b;
                xc0 xc0Var = (xc0) o10Var.j;
                mk0 mk0Var = (mk0) o10Var.b;
                int i2 = message.what;
                if (i2 == R.id.zxing_decode) {
                    r67 r67Var = (r67) message.obj;
                    Handler handler = (Handler) o10Var.f;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Rect rect = (Rect) o10Var.g;
                    r67Var.d = rect;
                    l70 l70Var = r67Var.a;
                    int i3 = l70Var.b;
                    if (rect == null) {
                        z = true;
                    } else {
                        int i4 = r67Var.c;
                        byte[] bArr = l70Var.a;
                        int i5 = l70Var.c;
                        if (i4 == 90) {
                            byte[] bArr2 = new byte[i3 * i5];
                            int i6 = 0;
                            for (int i7 = 0; i7 < i3; i7++) {
                                for (int i8 = i5 - 1; i8 >= 0; i8--) {
                                    bArr2[i6] = bArr[(i8 * i3) + i7];
                                    i6++;
                                }
                            }
                            l70Var = new l70(bArr2, i5, i3);
                        } else if (i4 == 180) {
                            int i9 = i3 * i5;
                            byte[] bArr3 = new byte[i9];
                            int i10 = i9 - 1;
                            for (int i11 = 0; i11 < i9; i11++) {
                                bArr3[i10] = bArr[i11];
                                i10--;
                            }
                            l70Var = new l70(bArr3, i3, i5);
                        } else if (i4 == 270) {
                            int i12 = i3 * i5;
                            byte[] bArr4 = new byte[i12];
                            int i13 = i12 - 1;
                            for (int i14 = 0; i14 < i3; i14++) {
                                for (int i15 = i5 - 1; i15 >= 0; i15--) {
                                    bArr4[i13] = bArr[(i15 * i3) + i14];
                                    i13--;
                                }
                            }
                            l70Var = new l70(bArr4, i5, i3);
                        }
                        Rect rect2 = r67Var.d;
                        byte[] bArr5 = l70Var.a;
                        int iWidth = rect2.width();
                        int iHeight = rect2.height();
                        int i16 = rect2.top;
                        byte[] bArr6 = new byte[iWidth * iHeight];
                        int i17 = l70Var.b;
                        int i18 = (i16 * i17) + rect2.left;
                        for (int i19 = 0; i19 < iHeight; i19++) {
                            System.arraycopy(bArr5, i18, bArr6, i19 * iWidth, iWidth);
                            i18 += i17;
                        }
                        nl5Var = new nl5(bArr6, iWidth, iHeight, iWidth, iHeight);
                    }
                    if (nl5Var != null) {
                        zi1 zi1Var = (zi1) o10Var.e;
                        cj3 cj3VarB = zi1Var.b(nl5Var);
                        uu4 uu4Var = zi1Var.a;
                        zi1Var.b.clear();
                        try {
                            try {
                                if (uu4Var.b == null) {
                                    uc6Var = null;
                                    try {
                                        uu4Var.c(null);
                                    } catch (Exception unused) {
                                        uu4Var.reset();
                                        uc6VarB = uc6Var;
                                    }
                                } else {
                                    uc6Var = null;
                                }
                                uc6VarB = uu4Var.b(cj3VarB);
                                uu4Var.reset();
                            } catch (Throwable th) {
                                uu4Var.reset();
                                throw th;
                            }
                        } catch (Exception unused2) {
                            uc6Var = null;
                        }
                        if (uc6VarB != null) {
                            Log.d("o10", "Found barcode in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                            if (handler != null) {
                                x20 x20Var = new x20();
                                x20Var.a = uc6VarB;
                                x20Var.b = r67Var;
                                Message messageObtain = Message.obtain(handler, R.id.zxing_decode_succeeded, x20Var);
                                messageObtain.setData(new Bundle());
                                messageObtain.sendToTarget();
                            }
                        } else if (handler != null) {
                            Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                        }
                        if (handler != null) {
                            zi1 zi1Var2 = (zi1) o10Var.e;
                            zi1Var2.getClass();
                            ArrayList<wc6> arrayList2 = new ArrayList(zi1Var2.b);
                            arrayList = new ArrayList(arrayList2.size());
                            for (wc6 wc6Var : arrayList2) {
                                float f2 = wc6Var.a * 1.0f;
                                Rect rect3 = r67Var.d;
                                f = f2 + rect3.left;
                                float f3 = (wc6Var.b * 1.0f) + rect3.top;
                                if (r67Var.e) {
                                    f = i3 - f;
                                }
                                arrayList.add(new wc6(f, f3));
                            }
                            Message.obtain(handler, R.id.zxing_possible_result_points, arrayList).sendToTarget();
                        }
                        mk0Var.h.post(new kk0(mk0Var, xc0Var, (byte) 0));
                    } else {
                        uc6Var = null;
                    }
                    uc6VarB = uc6Var;
                    if (uc6VarB != null) {
                        Log.d("o10", "Found barcode in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                        if (handler != null) {
                            x20 x20Var2 = new x20();
                            x20Var2.a = uc6VarB;
                            x20Var2.b = r67Var;
                            Message messageObtain2 = Message.obtain(handler, R.id.zxing_decode_succeeded, x20Var2);
                            messageObtain2.setData(new Bundle());
                            messageObtain2.sendToTarget();
                        }
                    } else if (handler != null) {
                        Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                    }
                    if (handler != null) {
                        zi1 zi1Var3 = (zi1) o10Var.e;
                        zi1Var3.getClass();
                        ArrayList<wc6> arrayList3 = new ArrayList(zi1Var3.b);
                        arrayList = new ArrayList(arrayList3.size());
                        while (r5.hasNext()) {
                            float f4 = wc6Var.a * 1.0f;
                            Rect rect4 = r67Var.d;
                            f = f4 + rect4.left;
                            float f5 = (wc6Var.b * 1.0f) + rect4.top;
                            if (r67Var.e) {
                                f = i3 - f;
                            }
                            arrayList.add(new wc6(f, f5));
                        }
                        Message.obtain(handler, R.id.zxing_possible_result_points, arrayList).sendToTarget();
                    }
                    mk0Var.h.post(new kk0(mk0Var, xc0Var, (byte) 0));
                } else {
                    z = true;
                    if (i2 == R.id.zxing_preview_failed) {
                        mk0Var.h.post(new kk0(mk0Var, xc0Var, objArr == true ? 1 : 0));
                    }
                }
                return z;
            case 2:
                if (message.what != 0) {
                    return false;
                }
                pn5 pn5Var = (pn5) this.b;
                y37 y37Var = (y37) message.obj;
                synchronized (pn5Var.m) {
                    if (((y37) pn5Var.f1752o) == y37Var || ((y37) pn5Var.p) == y37Var) {
                        pn5Var.e(y37Var, 2);
                    }
                    break;
                }
                return true;
            case 3:
                int i20 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i20).length() + 30);
                    sb.append("Received response to request: ");
                    sb.append(i20);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                tx8 tx8Var = (tx8) this.b;
                synchronized (tx8Var) {
                    try {
                        SparseArray sparseArray = tx8Var.e;
                        yx8 yx8Var = (yx8) sparseArray.get(i20);
                        if (yx8Var != null) {
                            sparseArray.remove(i20);
                            tx8Var.d();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (yx8Var.e) {
                                    case 0:
                                        if (data.getBoolean("ack", false)) {
                                            yx8Var.b(null);
                                        } else {
                                            yx8Var.c(new dy8("Invalid response to one way request", null));
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        yx8Var.b(bundle);
                                        break;
                                }
                            } else {
                                yx8Var.c(new dy8("Not supported by GmsCore", null));
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i20).length() + 39);
                            sb2.append("Received response for unknown request: ");
                            sb2.append(i20);
                            io.sentry.android.core.v0.j("MessengerIpcClient", sb2.toString());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            default:
                int i21 = message.what;
                if (i21 == 0) {
                    ux8 ux8Var = (ux8) this.b;
                    synchronized (ux8Var.a) {
                        try {
                            nx8 nx8Var = (nx8) message.obj;
                            qx8 qx8Var = (qx8) ux8Var.a.get(nx8Var);
                            if (qx8Var != null && qx8Var.a.isEmpty()) {
                                if (qx8Var.c) {
                                    nx8 nx8Var2 = qx8Var.e;
                                    ux8 ux8Var2 = qx8Var.g;
                                    ux8Var2.c.removeMessages(1, nx8Var2);
                                    ux8Var2.d.b(ux8Var2.b, qx8Var);
                                    qx8Var.c = false;
                                    qx8Var.b = (byte) 2;
                                }
                                ux8Var.a.remove(nx8Var);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return true;
                }
                if (i21 != 1) {
                    return false;
                }
                ux8 ux8Var3 = (ux8) this.b;
                synchronized (ux8Var3.a) {
                    try {
                        nx8 nx8Var3 = (nx8) message.obj;
                        qx8 qx8Var2 = (qx8) ux8Var3.a.get(nx8Var3);
                        if (qx8Var2 != null && qx8Var2.b == 3) {
                            String strValueOf = String.valueOf(nx8Var3);
                            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 47);
                            sb3.append("Timeout waiting for ServiceConnection callback ");
                            sb3.append(strValueOf);
                            io.sentry.android.core.v0.d("GmsClientSupervisor", sb3.toString(), new Exception());
                            ComponentName componentName2 = qx8Var2.f;
                            if (componentName2 == null) {
                                nx8Var3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                nx8Var3.getClass();
                                componentName = new ComponentName("com.google.android.gms", "unknown");
                            }
                            qx8Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return true;
        }
    }
}
