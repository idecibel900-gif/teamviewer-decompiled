package o;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class st8 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2051o;

    public /* synthetic */ st8(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2051o = obj2;
    }

    private final void a() {
        yx8 yx8Var = (yx8) this.f2051o;
        tx8 tx8Var = (tx8) this.n;
        int i = yx8Var.a;
        synchronized (tx8Var) {
            SparseArray sparseArray = tx8Var.e;
            yx8 yx8Var2 = (yx8) sparseArray.get(i);
            if (yx8Var2 != null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                sb.append("Timing out request: ");
                sb.append(i);
                io.sentry.android.core.v0.j("MessengerIpcClient", sb.toString());
                sparseArray.remove(i);
                yx8Var2.c(new dy8("Timed out waiting for response", null));
                tx8Var.d();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                bt8 bt8Var = (bt8) this.f2051o;
                hy8 hy8Var = bt8Var.p;
                try {
                    bo7 bo7Var = (bo7) bt8Var.f456o.j((bo7) this.n);
                    if (bo7Var == null) {
                        bt8Var.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    m12 m12Var = eo7.b;
                    bo7Var.e(m12Var, bt8Var);
                    bo7Var.d(m12Var, bt8Var);
                    bo7Var.a(m12Var, bt8Var);
                    return;
                } catch (lg6 e) {
                    if (e.getCause() instanceof Exception) {
                        hy8Var.n((Exception) e.getCause());
                        return;
                    } else {
                        hy8Var.n(e);
                        return;
                    }
                } catch (Exception e2) {
                    hy8Var.n(e2);
                    return;
                }
            case 1:
                bv8 bv8Var = (bv8) this.f2051o;
                synchronized (bv8Var.f461o) {
                    ((t75) bv8Var.p).m((bo7) this.n);
                    break;
                }
                return;
            case 2:
                bv8 bv8Var2 = (bv8) this.f2051o;
                synchronized (bv8Var2.f461o) {
                    x75 x75Var = (x75) bv8Var2.p;
                    Exception excH = ((bo7) this.n).h();
                    nv1.s(excH);
                    x75Var.onFailure(excH);
                    break;
                }
                return;
            case 3:
                IBinder iBinder = (IBinder) this.f2051o;
                tx8 tx8Var = (tx8) this.n;
                synchronized (tx8Var) {
                    if (iBinder == null) {
                        tx8Var.b("Null service connection");
                    } else {
                        try {
                            tx8Var.c = new lh7(iBinder);
                            tx8Var.a = (byte) 2;
                            ((ScheduledExecutorService) tx8Var.f.d).execute(new cw8(tx8Var, (byte) 1));
                        } catch (RemoteException e3) {
                            tx8Var.b(e3.getMessage());
                        }
                    }
                }
                return;
            case 4:
                bv8 bv8Var3 = (bv8) this.f2051o;
                synchronized (bv8Var3.f461o) {
                    ((d85) bv8Var3.p).onSuccess(((bo7) this.n).i());
                    break;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                bv8 bv8Var4 = (bv8) this.f2051o;
                hy8 hy8Var2 = (hy8) bv8Var4.p;
                try {
                    bo7 bo7VarI = ((le7) bv8Var4.f461o).i(((bo7) this.n).i());
                    if (bo7VarI == null) {
                        hy8Var2.n(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    m12 m12Var2 = eo7.b;
                    bo7VarI.e(m12Var2, bv8Var4);
                    bo7VarI.d(m12Var2, bv8Var4);
                    bo7VarI.a(m12Var2, bv8Var4);
                    return;
                } catch (CancellationException unused) {
                    bv8Var4.onCanceled();
                    return;
                } catch (lg6 e4) {
                    if (e4.getCause() instanceof Exception) {
                        bv8Var4.onFailure((Exception) e4.getCause());
                        return;
                    } else {
                        hy8Var2.n(e4);
                        return;
                    }
                } catch (Exception e5) {
                    hy8Var2.n(e5);
                    return;
                }
            default:
                hy8 hy8Var3 = (hy8) this.n;
                try {
                    hy8Var3.m(((Callable) this.f2051o).call());
                    return;
                } catch (Exception e6) {
                    hy8Var3.n(e6);
                    return;
                } catch (Throwable th) {
                    hy8Var3.n(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ st8(wx8 wx8Var, bo7 bo7Var, byte b) {
        this.m = b;
        this.n = bo7Var;
        this.f2051o = wx8Var;
    }
}
