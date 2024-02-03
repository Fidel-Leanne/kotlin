class FancyInfoProvider(provideInfo: String) : BasicInfo(provideInfo) {
    override fun printNewLine() {
        super.printNewLine()
    }

    override val provideInfo: String
        get() = super.provideInfo
}