/*
 *   Copyright © 2017-2021 PSPDFKit GmbH. All rights reserved.
 *
 *   The PSPDFKit Sample applications are licensed with a modified BSD license.
 *   Please see License for details. This notice may not be removed from this file.
 */

package com.pspdfkit.example.instant.api;

import androidx.annotation.NonNull;

import java.util.List;

/**
 * List of documents returned by "GET /api/documents" from web example server.
 */
class WebExampleDocumentList {
    @NonNull public final List<WebExampleDocument> documents;

    public WebExampleDocumentList(@NonNull List<WebExampleDocument> documents) {
        this.documents = documents;
    }
}
