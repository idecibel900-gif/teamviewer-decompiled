package o;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fy6 extends nw4 {
    public final SharedPreferences a;
    public final String b;
    public final k41 c;

    public fy6(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = "INPUT_METHOD_INT";
        k41 k41Var = new k41(this, (byte) 3);
        this.c = k41Var;
        super.setValue(b());
        sharedPreferences.registerOnSharedPreferenceChangeListener(k41Var);
    }

    public static final void c(fy6 fy6Var, String str) {
        if (im3.n(fy6Var.b, str)) {
            if (im3.n(Looper.getMainLooper(), Looper.myLooper())) {
                super.setValue(fy6Var.b());
            } else {
                fy6Var.postValue(fy6Var.b());
            }
        }
    }

    public final Object b() {
        Map<String, ?> all = this.a.getAll();
        Object obj = all != null ? all.get(this.b) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final void finalize() {
        this.a.unregisterOnSharedPreferenceChangeListener(this.c);
    }

    @Override // androidx.lifecycle.LiveData
    public final void setValue(Object obj) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.getClass();
        boolean z = obj instanceof Boolean;
        String str = this.b;
        if (z) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            editorEdit.putString(str, (String) obj);
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Number) obj).intValue());
        } else {
            if (!(obj instanceof Float)) {
                if (obj instanceof Set) {
                    Iterable iterable = (Iterable) obj;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (it.next() instanceof String) {
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (obj2 instanceof String) {
                            arrayList.add(obj2);
                        }
                    }
                    Set<String> setT0 = lv0.T0(arrayList);
                    if (setT0.size() != ((Set) obj).size()) {
                        hk0.g("Set contains non-String elements");
                        return;
                    }
                    editorEdit.putStringSet(str, setT0);
                }
                obj.getClass();
                io.sentry.h2.h(obj.getClass(), "Encountered unknown Preference type: ");
                return;
            }
            editorEdit.putFloat(str, ((Number) obj).floatValue());
        }
        editorEdit.commit();
    }
}
