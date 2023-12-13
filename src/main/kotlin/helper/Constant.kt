package helper

const val ANSI_RESET = "\u001b[0m"
const val ANSI_RED = "\u001b[31m"
const val ANSI_YELLOW = "\u001B[33m";
const val ANSI_GREEN = "\u001B[32m";
const val ANSI_BLUE = "\u001B[34m";
const val ANSI_PURPLE = "\u001B[35m";

val colors = arrayOf(
    "${ANSI_RED}1. Merah${ANSI_RESET}",
    "${ANSI_YELLOW}2. Kuning${ANSI_RESET}",
    "${ANSI_GREEN}3. Hijau${ANSI_RESET}",
    "${ANSI_BLUE}4. Biru${ANSI_RESET}",
    "${ANSI_PURPLE}5. Ungu${ANSI_RESET}"
)

val menus = arrayOf(
    "1. Piramida Bintang",
    "2. Piramida Terbalik Bintang",
    "3. Layang-layang Bintang",
    "4. X Bintang",
    "5. Piramida Hollow Bintang",
    "6. Persegi",
    "7. Persegi Panjang",
    "8. Jajar Genjang",
    "9. Trapesium",
    "10. Segi enam"
)