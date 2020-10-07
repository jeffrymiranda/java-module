module academy.jmiranda.db {
    requires java.sql;
    requires sqlite.jdbc; // lib/jar files
    requires transitive academy.jmiranda.common;

    exports academy.jmiranda.db;
}