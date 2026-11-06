package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: classes2.dex */
public final class s35 extends lt3 {
    public static Long l0(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // o.sj2
    public final sn1 Y(wg5 wg5Var) {
        wg5 wg5VarS;
        wg5Var.getClass();
        Path path = Paths.get(wg5Var.m.s(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = wg5.n;
                wg5VarS = vv.s(symbolicLink.toString());
            } else {
                wg5VarS = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lL0 = fileTimeCreationTime != null ? l0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lL1 = fileTimeLastModifiedTime != null ? l0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new sn1(zIsRegularFile, zIsDirectory, wg5VarS, lValueOf, lL0, lL1, fileTimeLastAccessTime != null ? l0(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // o.sj2
    public final void j(wg5 wg5Var, wg5 wg5Var2) throws IOException {
        wg5Var2.getClass();
        try {
            Path path = Paths.get(wg5Var.m.s(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(wg5Var2.m.s(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            gk0.l("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // o.lt3
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
