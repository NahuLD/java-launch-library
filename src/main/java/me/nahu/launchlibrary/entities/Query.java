package me.nahu.launchlibrary.entities;

public class Query {
    private int total;
    private int count;
    private int offset;

    private String status;
    private String msg;

    /**
     * Total results found.
     * @return {@link Integer} amount of results.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Result count, used for pagination.
     * @return {@link Integer} count.
     */
    public int getCount() {
        return count;
    }

    /**
     * Offset used for pagination.
     * @return {@link Integer} offset.
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Status returned by the request.
     * @return {@link String} result.
     */
    public String getStatus() {
        return status;
    }

    /**
     * A probably less than helpful error message.
     * @return {@link String} message.
     */
    public String getMessage() {
        return msg;
    }
}
