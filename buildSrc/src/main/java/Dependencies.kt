object Dependencies {

    const val CORE_KOTLIN = "androidx.core:core-ktx:${Versions.CORE_KOTLIN}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"

    object Ui {
        const val MATERIAL = "com.google.android.material:material:${Versions.Ui.MATERIAL}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.Ui.CONSTRAINT_LAYOUT}"
    }

    object Tests {
        const val JUNIT = "junit:junit:${Versions.Tests.JUNIT}"
        const val JUNIT_EXT = "androidx.test.ext:junit:${Versions.Tests.JUNIT_EXT}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.Tests.ESPRESSO}"
    }
}