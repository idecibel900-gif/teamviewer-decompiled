package com.google.firebase.datastorage;

import android.content.Context;
import android.os.Process;
import io.sentry.android.core.v0;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import o.ah1;
import o.ba2;
import o.bj0;
import o.ci1;
import o.ct1;
import o.er5;
import o.f88;
import o.fa2;
import o.fw3;
import o.fx4;
import o.g22;
import o.g57;
import o.g95;
import o.gk1;
import o.go2;
import o.gr5;
import o.hc1;
import o.hk0;
import o.hm3;
import o.hu5;
import o.hw2;
import o.i9;
import o.im3;
import o.iy6;
import o.jy6;
import o.ky6;
import o.lq5;
import o.m36;
import o.me1;
import o.ne1;
import o.nq5;
import o.og7;
import o.qf0;
import o.r31;
import o.se7;
import o.te1;
import o.tk1;
import o.vn4;
import o.w86;
import o.wn3;
import o.xk0;
import o.xo1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R%\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0%*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/google/firebase/datastorage/JavaDataStorage;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Lo/er5;", "key", "defaultValue", "getSync", "(Lo/er5;Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lo/gr5;", "putSync", "(Lo/er5;Ljava/lang/Object;)Lo/gr5;", "", "getAllSync", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lo/fx4;", "Lo/f88;", "transform", "editSync", "(Lkotlin/jvm/functions/Function1;)Lo/gr5;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "", "editLock", "Ljava/lang/ThreadLocal;", "Lo/ah1;", "dataStore$delegate", "Lo/m36;", "getDataStore", "(Landroid/content/Context;)Lo/ah1;", "dataStore", "Lo/ah1;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaDataStorage {
    static final /* synthetic */ fw3[] $$delegatedProperties = {w86.a.h(new hu5(bj0.NO_RECEIVER, JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    private final Context context;
    private final ah1 dataStore;

    /* JADX INFO: renamed from: dataStore$delegate, reason: from kotlin metadata */
    private final m36 dataStore;
    private final ThreadLocal<Boolean> editLock;
    private final String name;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/me1;", "Lo/gr5;", "<anonymous>", "(Lo/me1;)Lo/gr5;"}, k = 3, mv = {2, 0, 0})
    @ci1(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends og7 implements hw2 {
        final /* synthetic */ Function1 $transform;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/fx4;", "it", "Lo/f88;", "<anonymous>", "(Lo/fx4;)V"}, k = 3, mv = {2, 0, 0})
        @ci1(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        public static final class C00001 extends og7 implements hw2 {
            final /* synthetic */ Function1 $transform;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(Function1 function1, hc1<? super C00001> hc1Var) {
                super(2, hc1Var);
                this.$transform = function1;
            }

            @Override // o.i30
            public final hc1<f88> create(Object obj, hc1<?> hc1Var) {
                C00001 c00001 = new C00001(this.$transform, hc1Var);
                c00001.L$0 = obj;
                return c00001;
            }

            @Override // o.hw2
            public final Object invoke(fx4 fx4Var, hc1<? super f88> hc1Var) {
                return ((C00001) create(fx4Var, hc1Var)).invokeSuspend(f88.a);
            }

            @Override // o.i30
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                this.$transform.invoke((fx4) this.L$0);
                return f88.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function1 function1, hc1<? super AnonymousClass1> hc1Var) {
            super(2, hc1Var);
            this.$transform = function1;
        }

        @Override // o.i30
        public final hc1<f88> create(Object obj, hc1<?> hc1Var) {
            return JavaDataStorage.this.new AnonymousClass1(this.$transform, hc1Var);
        }

        @Override // o.hw2
        public final Object invoke(me1 me1Var, hc1<? super gr5> hc1Var) {
            return ((AnonymousClass1) create(me1Var, hc1Var)).invokeSuspend(f88.a);
        }

        @Override // o.i30
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            hc1 hc1Var = null;
            byte b = 1;
            try {
                if (i == 0) {
                    ct1.a0(obj);
                    Object obj2 = JavaDataStorage.this.editLock.get();
                    Boolean bool = Boolean.TRUE;
                    if (im3.n(obj2, bool)) {
                        hk0.l("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                    JavaDataStorage.this.editLock.set(bool);
                    ah1 ah1Var = JavaDataStorage.this.dataStore;
                    C00001 c00001 = new C00001(this.$transform, null);
                    this.label = 1;
                    obj = ah1Var.a(new lq5(c00001, hc1Var, b), this);
                    ne1 ne1Var = ne1.m;
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                gr5 gr5Var = (gr5) obj;
                JavaDataStorage.this.editLock.set(Boolean.FALSE);
                return gr5Var;
            } catch (Throwable th) {
                JavaDataStorage.this.editLock.set(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getAllSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/me1;", "", "Lo/er5;", "", "<anonymous>", "(Lo/me1;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    @ci1(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
    public static final class C00021 extends og7 implements hw2 {
        int label;

        public C00021(hc1<? super C00021> hc1Var) {
            super(2, hc1Var);
        }

        @Override // o.i30
        public final hc1<f88> create(Object obj, hc1<?> hc1Var) {
            return JavaDataStorage.this.new C00021(hc1Var);
        }

        @Override // o.hw2
        public final Object invoke(me1 me1Var, hc1<? super Map<er5, ? extends Object>> hc1Var) {
            return ((C00021) create(me1Var, hc1Var)).invokeSuspend(f88.a);
        }

        @Override // o.i30
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ct1.a0(obj);
                go2 data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = xo1.M(data, this);
                ne1 ne1Var = ne1.m;
                if (obj == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (i != 1) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
            }
            gr5 gr5Var = (gr5) obj;
            return gr5Var != null ? gr5Var.a() : fa2.m;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo/me1;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @ci1(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {104}, m = "invokeSuspend")
    public static final class C00031 extends og7 implements hw2 {
        final /* synthetic */ T $defaultValue;
        final /* synthetic */ er5 $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00031(er5 er5Var, T t, hc1<? super C00031> hc1Var) {
            super(2, hc1Var);
            this.$key = er5Var;
            this.$defaultValue = t;
        }

        @Override // o.i30
        public final hc1<f88> create(Object obj, hc1<?> hc1Var) {
            return JavaDataStorage.this.new C00031(this.$key, this.$defaultValue, hc1Var);
        }

        @Override // o.hw2
        public final Object invoke(me1 me1Var, hc1<? super T> hc1Var) {
            return ((C00031) create(me1Var, hc1Var)).invokeSuspend(f88.a);
        }

        @Override // o.i30
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ct1.a0(obj);
                go2 data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = xo1.M(data, this);
                ne1 ne1Var = ne1.m;
                if (obj == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (i != 1) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
            }
            gr5 gr5Var = (gr5) obj;
            if (gr5Var != null) {
                er5 er5Var = this.$key;
                er5Var.getClass();
                Object objCopyOf = ((fx4) gr5Var).a.get(er5Var);
                if (objCopyOf instanceof byte[]) {
                    byte[] bArr = (byte[]) objCopyOf;
                    objCopyOf = Arrays.copyOf(bArr, bArr.length);
                }
                if (objCopyOf != null) {
                    return objCopyOf;
                }
            }
            return this.$defaultValue;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/me1;", "Lo/gr5;", "<anonymous>", "(Lo/me1;)Lo/gr5;"}, k = 3, mv = {2, 0, 0})
    @ci1(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
    public static final class C00041 extends og7 implements hw2 {
        final /* synthetic */ er5 $key;
        final /* synthetic */ T $value;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/fx4;", "it", "Lo/f88;", "<anonymous>", "(Lo/fx4;)V"}, k = 3, mv = {2, 0, 0})
        @ci1(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        public static final class C00011 extends og7 implements hw2 {
            final /* synthetic */ er5 $key;
            final /* synthetic */ T $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00011(er5 er5Var, T t, hc1<? super C00011> hc1Var) {
                super(2, hc1Var);
                this.$key = er5Var;
                this.$value = t;
            }

            @Override // o.i30
            public final hc1<f88> create(Object obj, hc1<?> hc1Var) {
                C00011 c00011 = new C00011(this.$key, this.$value, hc1Var);
                c00011.L$0 = obj;
                return c00011;
            }

            @Override // o.hw2
            public final Object invoke(fx4 fx4Var, hc1<? super f88> hc1Var) {
                return ((C00011) create(fx4Var, hc1Var)).invokeSuspend(f88.a);
            }

            @Override // o.i30
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ((fx4) this.L$0).c(this.$key, this.$value);
                return f88.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00041(er5 er5Var, T t, hc1<? super C00041> hc1Var) {
            super(2, hc1Var);
            this.$key = er5Var;
            this.$value = t;
        }

        @Override // o.i30
        public final hc1<f88> create(Object obj, hc1<?> hc1Var) {
            return JavaDataStorage.this.new C00041(this.$key, this.$value, hc1Var);
        }

        @Override // o.hw2
        public final Object invoke(me1 me1Var, hc1<? super gr5> hc1Var) {
            return ((C00041) create(me1Var, hc1Var)).invokeSuspend(f88.a);
        }

        @Override // o.i30
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            hc1 hc1Var = null;
            byte b = 1;
            if (i != 0) {
                if (i == 1) {
                    ct1.a0(obj);
                    return obj;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            ah1 ah1Var = JavaDataStorage.this.dataStore;
            C00011 c00011 = new C00011(this.$key, this.$value, null);
            this.label = 1;
            Object objA = ah1Var.a(new lq5(c00011, hc1Var, b), this);
            ne1 ne1Var = ne1.m;
            return objA == ne1Var ? ne1Var : objA;
        }
    }

    public JavaDataStorage(Context context, String str) {
        context.getClass();
        str.getClass();
        this.context = context;
        this.name = str;
        this.editLock = new ThreadLocal<>();
        g95 g95Var = new g95(new wn3(this, (byte) 0));
        wn3 wn3Var = new wn3(this, (byte) 1);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        se7 se7VarA = g57.a();
        gk1Var.getClass();
        this.dataStore = new nq5(str, g95Var, wn3Var, hm3.c(xk0.G(gk1Var, se7VarA)));
        this.dataStore = getDataStore(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gr5 dataStore_delegate$lambda$0(JavaDataStorage javaDataStorage, te1 te1Var) {
        te1Var.getClass();
        v0.l(w86.a.b(JavaDataStorage.class).f(), "CorruptionException in " + javaDataStorage.name + " DataStore running in process " + Process.myPid(), te1Var);
        return new fx4(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dataStore_delegate$lambda$1(JavaDataStorage javaDataStorage, Context context) {
        context.getClass();
        String str = javaDataStorage.name;
        LinkedHashSet linkedHashSet = jy6.a;
        str.getClass();
        linkedHashSet.getClass();
        hc1 hc1Var = null;
        return qf0.K(new iy6(context, str, ky6.a, new i9(linkedHashSet, hc1Var, (byte) 24), new r31(3, hc1Var, (byte) 2)));
    }

    private final ah1 getDataStore(Context context) {
        return (ah1) this.dataStore.a(context, $$delegatedProperties[0]);
    }

    public final gr5 editSync(Function1 transform) {
        transform.getClass();
        return (gr5) vn4.u0(ba2.m, new AnonymousClass1(transform, null));
    }

    public final Map<er5, Object> getAllSync() {
        return (Map) vn4.u0(ba2.m, new C00021(null));
    }

    public final <T> T getSync(er5 key, T defaultValue) {
        key.getClass();
        return (T) vn4.u0(ba2.m, new C00031(key, defaultValue, null));
    }

    public final <T> gr5 putSync(er5 key, T value) {
        key.getClass();
        return (gr5) vn4.u0(ba2.m, new C00041(key, value, null));
    }
}
