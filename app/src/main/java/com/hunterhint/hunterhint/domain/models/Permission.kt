package com.hunterhint.hunterhint.domain.models

enum class Permission (val id:Int) {
    BOOK_TOUR(0),
    OWNER_CLOSE_BOOKING(1),
    OWNER_ADD_GROUND(2),
    OWNER(3),
    ADMIN(4),
    DELETE_ANY_COMMENT(5),
    DELETE_ANY_GROUND(6),
    BLOCK_ANY_GROUND(7),
    BLOCK_ANY_USER(8),
    ADD_COMMENT(9)
}