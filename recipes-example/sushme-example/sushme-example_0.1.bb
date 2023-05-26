SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build

LIC_FILES_CHKSUM = "file://LICENSE;md5=d245720e64635d7c0ea25fa407aa65d9"

FILESEXTRAPATH_prepend :="${THISDIR}/${PN}-${PV}:"

#SRC_URI[sha256sum] = "b8d440009d1713c478431f650e33a99ca4c5939e38bcebe26c18e894c2c907f9"

SRCREV = "57147ede9b758fce06ad9a793d97b413ffca1b68"
SRC_URI = "git://git@github.com/sushmedass/sushme-example.git;branch=master;protocol=ssh"

S = "${WORKDIR}/git"

inherit autotools

PARALLEL_MAKE = ""
