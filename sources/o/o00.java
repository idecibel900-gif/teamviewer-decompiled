package o;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o00 {
    public final long a;

    public o00(long j) {
        this.a = j;
    }

    public static o00 a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        o00 o00Var = new o00(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return o00Var;
                    }
                    o00 o00Var2 = new o00(jsonReader.nextLong());
                    jsonReader.close();
                    return o00Var2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o00) && this.a == ((o00) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return e41.k(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
