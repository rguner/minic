/*
 * QueueSamplerMXBean.java - MXBean interface describing the management operations and attributes for the QueueSampler MXBean. In this case there is a read-only
 * attribute "QueueSample" and an operation "clearQueue".
 */

package com.example;

// MBean de oldugu gibi MXBean ile bitmeli interface ismi.
// veya annotasyon kullanılmali.

/**
 * Open Types that are defined in the package javax.management.openmbean. The exact mapping rules appear in the MXBean specification. However, the general
 * principle is for simple types such as int or String to remain unchanged, while complex types such as MemoryUsage get mapped to the standard type
 * CompositeDataSupport.
 * 
 *
 */
// @MXBean
public interface QueueSamplerMXBean {

	public QueueSample getQueueSample();

	public void clearQueue();
}
