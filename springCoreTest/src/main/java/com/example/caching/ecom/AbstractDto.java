//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.caching.ecom;

import java.io.Serializable;

public class AbstractDto implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Long identifier;
    protected String createdBy;
    protected String lastModifiedBy;

    public AbstractDto() {
    }

    public Long getIdentifier() {
        return this.identifier;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setIdentifier(final Long identifier) {
        this.identifier = identifier;
    }

    public void setCreatedBy(final String createdBy) {
        this.createdBy = createdBy;
    }

    public void setLastModifiedBy(final String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof AbstractDto)) {
            return false;
        } else {
            AbstractDto other = (AbstractDto)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$identifier = this.getIdentifier();
                    Object other$identifier = other.getIdentifier();
                    if (this$identifier == null) {
                        if (other$identifier == null) {
                            break label47;
                        }
                    } else if (this$identifier.equals(other$identifier)) {
                        break label47;
                    }

                    return false;
                }

                Object this$createdBy = this.getCreatedBy();
                Object other$createdBy = other.getCreatedBy();
                if (this$createdBy == null) {
                    if (other$createdBy != null) {
                        return false;
                    }
                } else if (!this$createdBy.equals(other$createdBy)) {
                    return false;
                }

                Object this$lastModifiedBy = this.getLastModifiedBy();
                Object other$lastModifiedBy = other.getLastModifiedBy();
                if (this$lastModifiedBy == null) {
                    if (other$lastModifiedBy != null) {
                        return false;
                    }
                } else if (!this$lastModifiedBy.equals(other$lastModifiedBy)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AbstractDto;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $identifier = this.getIdentifier();
        result = result * 59 + ($identifier == null ? 43 : $identifier.hashCode());
        Object $createdBy = this.getCreatedBy();
        result = result * 59 + ($createdBy == null ? 43 : $createdBy.hashCode());
        Object $lastModifiedBy = this.getLastModifiedBy();
        result = result * 59 + ($lastModifiedBy == null ? 43 : $lastModifiedBy.hashCode());
        return result;
    }

    public String toString() {
        return "AbstractDto(identifier=" + this.getIdentifier() + ", createdBy=" + this.getCreatedBy() + ", lastModifiedBy=" + this.getLastModifiedBy() + ")";
    }
}
