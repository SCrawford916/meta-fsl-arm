# Copyright (C) 2012-2015 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require xf86-video-imxfb-vivante.inc

SRC_URI += "file://0001-MGS-907-X11-EXA-Warnings-causes-GCC5.2-build-to-fail.patch \
            file://Stop-using-Git-to-write-local-version.patch \
            file://Remove-dix-internal-header-usage.patch"

SRC_URI[md5sum] = "05c54ed6d63e2a21dc18219e70869c29"
SRC_URI[sha256sum] = "ab6a896cafba324105d26f52b7dad2c41d04d75cc9e48b66e8041a95660a04ee"
