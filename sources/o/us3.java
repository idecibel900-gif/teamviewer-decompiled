package o;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class us3 extends zu1 {
    public final Field d;

    public us3(Field field) {
        this.d = field;
    }

    @Override // o.zu1
    public final String m() {
        Field field = this.d;
        String name = field.getName();
        name.getClass();
        StringBuilder sb = new StringBuilder(sr3.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(p76.b(type));
        return sb.toString();
    }
}
