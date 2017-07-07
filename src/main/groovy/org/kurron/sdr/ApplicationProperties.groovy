package org.kurron.sdr

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Holds application properties.
 */
@ConfigurationProperties( value = 'producer', ignoreUnknownFields = false )
class ApplicationProperties {

}
