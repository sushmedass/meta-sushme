SUMMARY = "bitbake-layers recipe self learning"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = ""

FILESEXTRAPATH_prepend :="${THISDIR}/${PN}-${PV}:"

SRCREV = "57147ede9b758fce06ad9a793d97b413ffca1b68"
SRC_URI = "git://github.com:sushmedass/sushme-example.git"

S = "${WORKDIR}/git"

inherit autotools

PARALLEL_MAKE = ""
